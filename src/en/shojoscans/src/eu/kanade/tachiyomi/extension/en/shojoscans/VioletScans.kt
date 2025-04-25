package eu.kanade.tachiyomi.extension.en.shojoscans

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia

class VioletScans : MangaThemesia(
    "Violet Scans",
    "https://violetscans.com",
    "en",
    mangaUrlDirectory = "/comics",
) {
    override fun chapterListSelector() = "li[data-num]:has(> a[href]:not([data-bs-target='#lockedChapterModal']))"

    override val id = 9079184529211162476
}
