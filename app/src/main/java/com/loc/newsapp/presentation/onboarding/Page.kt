package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)


val pages = listOf(
    Page(
        title = "Actualite",
        description = "Restez informé et connecté avec l'actualité mondiale ! Découvrez, apprenez et restez à jour avec les dernières nouvelles.",
        image = R.drawable.news
    ),
    Page(
        title = "Sport",
        description = "Découvrez les dernières actualités sportives, les derniers transferts et familiarisez-vous avec de nouvelles disciplines sportives passionnantes",
        image = R.drawable.sport
    ),
    Page(
        title = "Santé",
        description = "Prenez soin de votre santé et de votre bien-être sur une plateforme regroupant les meilleurs conseils santé et de style de vie sain. Découvrez tout ce dont vous avez besoin pour une vie équilibrée et épanouissante.",
        image = R.drawable.sante
    )
)