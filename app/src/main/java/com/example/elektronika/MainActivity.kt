package com.example.elektronika

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.elektronika.ui.Navigation
import com.example.elektronika.ui.theme.ElektronikaTheme
import com.theberdakh.bouquet.HorizontalPDFReader
import com.theberdakh.bouquet.HorizontalPdfReaderState
import com.theberdakh.bouquet.VerticalPDFReader
import com.theberdakh.bouquet.VerticalPdfReaderState

class MainActivity : ComponentActivity() {
    private val viewModel: BouquetViewModel by viewModels()
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        window.setFlags(
            WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
            WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED
        )

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                viewModel.clearResource()
            }
        })


        setContent {
            ElektronikaTheme {
                // A surface container using the 'background' color from the theme

                navController = rememberNavController()

                MainContent(navController)




                }
            }
        }
    }

    @Composable
    private fun MainContent(navController: NavHostController) {

        val currentBackStackEntry by navController.currentBackStackEntryAsState()


        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            val scaffoldState = rememberScaffoldState()
                // val state = viewModel.stateFlow.collectAsState()


            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(text = stringResource(id = R.string.app_name)) })
                },
                scaffoldState = scaffoldState,

                ) { paddingValues ->

                Box(Modifier.padding(paddingValues)) {
                    Navigation(navController)
                }



                /* Box( modifier = Modifier.padding(innerPadding)){
                     when(val actualState = state.value){
                         null -> {
                             HomeScreen()
                         }
                         is VerticalPdfReaderState -> PDFView(
                             pdfState = actualState,
                             scaffoldState = scaffoldState
                         )
                         is HorizontalPdfReaderState -> HPDFView(
                             pdfState = actualState,
                             scaffoldState = scaffoldState
                         )
                     }
                 }*/


            }
    }

  /*  @Composable
    fun SelectionView() {
        Column(modifier = Modifier.fillMaxSize()) {

            SelectionElement(
                title = "Open asset file",
                text = "Open asset file in raw folder"
            ) {
                viewModel.openSource(
                    ResourceType.Asset(R.raw.full)
                )
            }
        }
    }*/

    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    fun SelectionElement(
        title: String,
        text: String,
        onClick: () -> Unit
    ) {
        Card(
            onClick = onClick,
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            backgroundColor = MaterialTheme.colors.surface,
            elevation = 4.dp
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = title,
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 16.dp,
                        bottom = 4.dp
                    ),
                    style = MaterialTheme.typography.body1
                )
                Text(
                    text = text,
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 4.dp,
                        bottom = 16.dp
                    ),
                    style = MaterialTheme.typography.caption
                )
            }
        }
    }

    @Composable
    fun PDFView(
        pdfState: VerticalPdfReaderState,
        scaffoldState: ScaffoldState
    ) {
        Box(
            contentAlignment = Alignment.TopStart
        ) {
            VerticalPDFReader(
                state = pdfState,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Gray)
            )
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                LinearProgressIndicator(
                    progress = pdfState.loadPercent / 100f,
                    color = Color.Red,
                    backgroundColor = Color.Green,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row(modifier = Modifier.alpha(0f)) {
                    Spacer(modifier = Modifier.width(16.dp))
                    Column(
                        modifier = Modifier
                            .background(
                                color = MaterialTheme.colors.surface.copy(alpha = 0.5f),
                                shape = MaterialTheme.shapes.medium
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Page: ${pdfState.currentPage}/${pdfState.pdfPageCount}",
                            modifier = Modifier.padding(
                                start = 8.dp,
                                end = 8.dp,
                                bottom = 4.dp,
                                top = 8.dp
                            )
                        )
                        Text(
                            text = if (pdfState.isScrolling) {
                                "Scrolling"
                            } else {
                                "Stationary"
                            },
                            color = if (pdfState.isScrolling) {
                                MaterialTheme.colors.onSurface
                            } else {
                                MaterialTheme.colors.error
                            },
                            modifier = Modifier.padding(
                                start = 8.dp,
                                end = 8.dp,
                                bottom = 8.dp,
                                top = 4.dp
                            )
                        )
                    }
                }
            }
            LaunchedEffect(key1 = pdfState.error) {
                pdfState.error?.let {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = it.message ?: "Error"
                    )
                }
            }
        }
    }

    @Composable
    fun HPDFView(
        pdfState: HorizontalPdfReaderState,
        scaffoldState: ScaffoldState
    ) {
        Box(
            contentAlignment = Alignment.TopStart
        ) {
            HorizontalPDFReader(
                state = pdfState,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Gray)
            )
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                LinearProgressIndicator(
                    progress = pdfState.loadPercent / 100f,
                    color = Color.Red,
                    backgroundColor = Color.Green,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row {
                    Spacer(modifier = Modifier.width(16.dp))
                    Column(
                        modifier = Modifier
                            .background(
                                color = MaterialTheme.colors.surface.copy(alpha = 0.5f),
                                shape = MaterialTheme.shapes.medium
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Page: ${pdfState.currentPage}/${pdfState.pdfPageCount}",
                            modifier = Modifier.padding(
                                start = 8.dp,
                                end = 8.dp,
                                bottom = 4.dp,
                                top = 8.dp
                            )
                        )
                        Text(
                            text = if (pdfState.isScrolling) {
                                "Scrolling"
                            } else {
                                "Stationary"
                            },
                            color = if (pdfState.isScrolling) {
                                MaterialTheme.colors.onSurface
                            } else {
                                MaterialTheme.colors.error
                            },
                            modifier = Modifier.padding(
                                start = 8.dp,
                                end = 8.dp,
                                bottom = 8.dp,
                                top = 4.dp
                            )
                        )
                        Text(text = "${pdfState.scale}")
                    }
                }
            }
            LaunchedEffect(key1 = pdfState.error) {
                pdfState.error?.let {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = it.message ?: "Error"
                    )
                }
            }
        }
    }

}
