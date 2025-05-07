class StreamingCommunity : MainAPI() {
    override var mainUrl = "https://streamingcommunity.spa"
    override var name = "StreamingCommunity"
    override var lang = "it"

    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun search(query: String): List<SearchResponse> {
        return listOf() // TODO: implementare la funzione di ricerca
    }

    override suspend fun load(url: String): LoadResponse? {
        return null // TODO: implementare il caricamento dei dettagli
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        return true // TODO: implementare il caricamento dei link di streaming
    }
}
