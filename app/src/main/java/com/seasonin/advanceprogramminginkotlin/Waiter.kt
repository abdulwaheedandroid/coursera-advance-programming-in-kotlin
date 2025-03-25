package com.seasonin.advanceprogramminginkotlin

class Waiter: Personnel {
    var id = -1
    var name = ""
    override fun serveCustomer() {
        TODO("Not yet implemented")
    }

    companion object {
        var branchName: String = ""
        var address : String = ""
    }
}