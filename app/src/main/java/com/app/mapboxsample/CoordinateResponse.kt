package com.app.mapboxsample

data class CoordinateResponse(
    var routes: List<Routes?>? = null,
    var waypoints: List<Waypoints>? = null,
    var code: String? = null,
    var uuid: String? = null
)

data class Routes(
    var geometry: Geometry? = null,
    var legs: List<Legs>? = null,
    var weightName: String? = null,
    var weight: Double = 0.0,
    var duration: Double = 0.0,
    var distance: Double = 0.0,
)

data class Geometry(
//    var coordinates: List<List<Double>?>? = null,
    var coordinates: List<List<Double>?>? = null,
    var type: String? = null
)

data class Legs(
    var steps: List<String?>? = null,
    var summary: String? = null,
    var weight: Double = 0.0,
    var duration: Double = 0.0,
    var distance: Double = 0.0
)

data class Waypoints(
    var distance: Double = 0.0,
    var name: String? = null,
    var location: List<Double>? = null
)