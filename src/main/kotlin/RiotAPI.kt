package net.guneyilmaz0.riotapi

import net.guneyilmaz0.riotapi.enums.Language
import net.guneyilmaz0.riotapi.enums.Region
import net.guneyilmaz0.riotapi.enums.Server

class RiotAPI(apiKey: String) : Queries() {

    init {
        this.apiKey = apiKey
    }

    constructor(apiKey: String, region: Region) : this(apiKey) {
        this.region = region
    }

    constructor(apiKey: String, region: Region, server: Server) : this(apiKey) {
        this.region = region
        this.server = server
    }

    constructor(apiKey: String, region: Region, server: Server, language: Language) : this(apiKey) {
        this.region = region
        this.server = server
        this.language = language
    }
}