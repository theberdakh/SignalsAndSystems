package com.example.elektronika.ui.data.repository

import com.example.elektronika.R
import com.example.elektronika.ui.data.model.Book

object BookRepository {

    fun getLectures() =
        listOf(
            Book(
                id = 1,
                title = "SIGNALLAR VA TIZIMLAR HAQIDA UMUMIY TUSHUNCHA",
                assetId = R.raw.lecture_1,
                section = Category.LECTURE
            ),
            Book(
                id = 2,
                title = "UZLUKSIZ SIGNALLARNING MATEMATIK IFODALARI",
                assetId = R.raw.lecture_2_3,
                section = Category.LECTURE
            ),
            Book(
                id = 3,
                title ="SIGNALLARNI DISKRET VAQT FUNKSIYASI SIFATIDA IFODALASH",
                assetId = R.raw.lecture_4_5,
                section = Category.LECTURE
            ),
            Book(
                id = 4,
                title = "TIZIMLARNI TA’RIFLASH VA TAHLIL QILISH",
                assetId = R.raw.lecture_6,
                section = Category.LECTURE
            ),
            Book(
                id = 5,
                title = "DISKRET VAQT TIZIMLARI",
                assetId = R.raw.lecture_7,
                section = Category.LECTURE
            ),
            Book(
                id = 6,
                title = "SIGNALLARNI FURE QATORIGA YOYISH",
                assetId = R.raw.lecture_8_9,
                section = Category.LECTURE
            ),
            Book(
                id = 7,
                title = "FURE ALMASHTIRISHING XOSSALARI",
                assetId = R.raw.lecture_10,
                section = Category.LECTURE
            ),
            Book(
                id = 8,
                title = "LAPLAS ALMASHTIRISHI. LAPLAS TO'G'RI VA TESKARI ALMASHTIRISHI. LAPLAS ALMASHTIRISHI XOSSALARI",
                assetId = R.raw.lecture_11_12,
                section = Category.LECTURE
            ),
            Book(
                id = 9,
                title ="Z-ALMASHTIRISH",
                assetId = R.raw.lecture_13_14_15,
                section = Category.LECTURE
            ),
            Book(
                id = 10,
                title = "SIGNALLARNI UZATISHDA ULARGA ISHLOV BERISH",
                assetId = R.raw.lecture_16_17_18,
                section = Category.LECTURE
            ),
            Book(
                id = 11,
                title = "SIGNALLARNI RAQAMLI FILTRLAR YORDAMIDA QAYTA ISHLASH",
                assetId = R.raw.lecture_19_20,
                section = Category.LECTURE
            ),
            Book(
                id = 12,
                title = "DISKRET SIGNALLARNI ALMASHTIRISH",
                assetId = R.raw.lecture_21_22,
                section = Category.LECTURE
            )

        )

    fun getPracticals() = listOf(
        Book(
            id = 1,
            title = "PERIODLÍ HÁM PERIODLÍ BOLMAǴAN SIGNALLARDÍŃ SPEKTORLARÍN ANALIZ ETIW",
            assetId = R.raw.signal_practical_1,
            section = Category.PRACTICAL
        ),
        Book(
            id = 3,
            title = "AMPLITUDA MODULYATORINI TADQIQ ETISH",
            assetId = R.raw.signal_practical_3,
            section = Category.PRACTICAL
        ), Book(
            id = 4,
            title = "АMPLITUDA MODULYATSIYALI SIGNALLARNI DETEKTORLASH ",
            assetId = R.raw.signal_practical_4,
            section = Category.PRACTICAL
        ),
        Book(
            id = 5,
            title = "CHASTOTA MODULYATORI VA CHASTOTA DETEKTORINI TADQIQ ETISH ",
            assetId = R.raw.signal_practical_1,
            section = Category.PRACTICAL
        ),

        )

    fun getDocuments() = listOf(
        Book(
            id = 1,
            title = "Oqıw qollanba",
            assetId = R.raw.signal_instruction,
            section = Category.DOCUMENTS
        ),
        Book(
            id = 2,
            title = "SILLABUS",
            assetId = R.raw.signal_syllabus,
            section = Category.DOCUMENTS
        ),
        Book(
            id = 3,
            title = "BAHALAW KRITERIYASÍ",
            assetId = R.raw.signal_assesment,
            section = Category.DOCUMENTS
        )
    )
    fun getExamMaterials() = listOf(
        Book(
            id = 1,
            title = "Aralıq hám juwmaqlawshı baqlaw sorawlar bankı",
            assetId = R.raw.signal_exam_questions,
            section = Category.EXAM
        )
    )
}

enum class Category {
    LECTURE, PRACTICAL, VIDEO, DOCUMENTS, EXAM
}