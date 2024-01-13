package com.example.elektronika.ui.data.repository

import com.example.elektronika.ui.data.model.Video

object VideoRepository {

    fun getSystemsAndSignalsVideos() =
        listOf(
            Video(
                id = 1,
                title = "Основы ЦОС: 01. Введение",
                url = "cRcSiALBfZI"
            ),
            Video(
                id = 2,
                title = "Основы ЦОС: 02. Сигналы, шумы и помехи",
                url = "8jp3WxOCxN8&list=PLmu_y3-DV2_kpP8oX_Uug0IbgH2T4hRPL&index=2"
            ),
            Video(
                id = 3,
                title = "Основы ЦОС: 03. Решаемые задачи",
                url = "xLii7YcSOn8&list=PLmu_y3-DV2_kpP8oX_Uug0IbgH2T4hRPL&index=3",
            ),
            Video(
                id = 4,
                title = "Основы ЦОС: 04. Знакомство с MATLAB",
                url = "Ggfe4WrtJZc&list=PLmu_y3-DV2_kpP8oX_Uug0IbgH2T4hRPL&index=4"
            ),
            Video(
                id = 5,
                title = "Основы ЦОС: 05. Создаем аккорд в MATLAB",
                url = "dmc5Z2JnQ3o&list=PLmu_y3-DV2_kpP8oX_Uug0IbgH2T4hRPL&index=5"
            ),
            Video(
                id = 6,
                title = "Основы ЦОС: 06. Выделяем тон из аккорда в MATLAB",
                url ="FYY7DYDwDvM&list=PLmu_y3-DV2_kpP8oX_Uug0IbgH2T4hRPL&index=6"
            ),
            Video(
                id = 7,
                title = "Основы ЦОС: 07. Анализ ЭКГ в MATLAB",
                url = "6gp7tcEbz2g&list=PLmu_y3-DV2_kpP8oX_Uug0IbgH2T4hRPL&index=7"
            ),
            Video(
                id = 8,
                title = "Основы ЦОС: 08. Дискретные периодические сигналы",
                url = "9hMKvbxvFyo&list=PLmu_y3-DV2_kpP8oX_Uug0IbgH2T4hRPL&index=8"
            ),
            Video(
                id = 9,
                title = "Основы ЦОС: 09. Синусоидальный сигнал как базис",
                url = "FW_gYZF1U28&list=PLmu_y3-DV2_kpP8oX_Uug0IbgH2T4hRPL&index=9"
            ),
            Video(
                id = 10,
                title = "Основы ЦОС: 10. Теорема Котельникова",
                url = "p-4nIChwIjs&list=PLmu_y3-DV2_kpP8oX_Uug0IbgH2T4hRPL&index=10"
            )


        )
}