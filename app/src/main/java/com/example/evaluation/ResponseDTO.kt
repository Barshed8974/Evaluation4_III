package com.example.evaluation

import java.io.Serializable

data class ResponseDTO(
	val resultCount: Int? = null,
	val results: List<ResultsDTO?>? = null
)