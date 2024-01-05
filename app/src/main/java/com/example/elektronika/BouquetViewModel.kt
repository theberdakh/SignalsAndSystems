package com.example.elektronika

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.theberdakh.bouquet.HorizontalPdfReaderState
import com.theberdakh.bouquet.PdfReaderState
import com.theberdakh.bouquet.ResourceType
import com.theberdakh.bouquet.VerticalPdfReaderState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class BouquetViewModel : ViewModel() {
    private val mStateFlow = MutableStateFlow<PdfReaderState?>(null)
    val stateFlow: StateFlow<PdfReaderState?> = mStateFlow

    private val switchState = mutableStateOf(false)

    fun openSource(resourceType: ResourceType) {
        mStateFlow.tryEmit(
            if (switchState.value) {
                HorizontalPdfReaderState(resourceType, true)
            } else {
                VerticalPdfReaderState(resourceType, true)
            }
        )
    }

    fun clearResource() {
        mStateFlow.tryEmit(null)
    }


}