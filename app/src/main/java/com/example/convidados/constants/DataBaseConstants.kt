package com.example.convidados.constants

class DataBaseConstants private constructor() {

    object GUEST {
        const val ID = "guestid"
        const val TABLE_NAME = "Guests"

        object COLUMNS {
            const val ID = "id"
            const val NAME = "name"
            const val PRESENCE = "presence"
        }
    }
}