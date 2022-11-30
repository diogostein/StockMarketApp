package com.codelabs.stockmarketapp.presentation.company_listing

sealed class CompanyListingEvent {
    object Refresh : CompanyListingEvent()
    data class OnSearchQueryChange(val query: String) : CompanyListingEvent()
}