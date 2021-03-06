package uz.icebegsoft.mobilenews.presentation.application.di.domain

import uz.icebegsoft.mobilenews.domain.usecase.article.dashboard.DashboardArticlesUseCase
import uz.icebegsoft.mobilenews.domain.usecase.article.detail.ArticleDetailUseCase
import uz.icebegsoft.mobilenews.domain.usecase.article.readlater.ReadLaterArticlesUseCase
import uz.icebegsoft.mobilenews.domain.usecase.article.recommended.RecommendedArticlesUseCase
import uz.icebegsoft.mobilenews.domain.usecase.bookmark.BookmarkUseCase
import uz.icebegsoft.mobilenews.domain.usecase.daynight.DayNightModeUseCase

interface DomainUseCaseProvider {
    val articleDetailUseCase: ArticleDetailUseCase
    val dashboardArticlesUseCase: DashboardArticlesUseCase
    val dayNightModeUseCase: DayNightModeUseCase
    val readLaterArticlesUseCase: ReadLaterArticlesUseCase
    val recommendedArticlesUseCase: RecommendedArticlesUseCase
    val bookmarkUseCase: BookmarkUseCase
}