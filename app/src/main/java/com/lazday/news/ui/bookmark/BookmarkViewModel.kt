package com.lazday.news.ui.bookmark

import androidx.lifecycle.ViewModel
import com.lazday.news.source.news.NewsRepository
import org.koin.dsl.module

val bookmarkViewModel = module {
    factory { BookmarkViewModel(get()) }
}

class BookmarkViewModel(
    val repository: NewsRepository
): ViewModel() {

    val tittle = "Disimpan"
    val articles = repository.db.findAll()
}