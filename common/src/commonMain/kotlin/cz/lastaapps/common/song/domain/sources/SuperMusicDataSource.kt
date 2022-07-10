package cz.lastaapps.common.song.domain.sources

import cz.lastaapps.common.song.domain.LoadSongDataSource
import cz.lastaapps.common.song.domain.SearchAuthorDataSource
import cz.lastaapps.common.song.domain.SearchSongByAuthorDataSource
import cz.lastaapps.common.song.domain.SearchSongDataSource

internal interface SuperMusicDataSource
    : SearchSongDataSource, SearchAuthorDataSource, LoadSongDataSource, SearchSongByAuthorDataSource