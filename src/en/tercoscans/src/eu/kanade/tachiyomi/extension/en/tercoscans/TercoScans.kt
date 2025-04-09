package eu.kanade.tachiyomi.extension.en.tercoscans

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import eu.kanade.tachiyomi.network.interceptor.rateLimit

class TercoScans : MangaThemesia(
    "Terco Scans",
    "https://tercofable.xyz",
    "en",
) {
    override val client = super.client.newBuilder()
        .rateLimit(3)
        .build()
}
