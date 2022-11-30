package com.codelabs.stockmarketapp.di

import com.codelabs.stockmarketapp.data.csv.CSVParser
import com.codelabs.stockmarketapp.data.csv.CompanyListingsParser
import com.codelabs.stockmarketapp.data.csv.IntradayInfoParser
import com.codelabs.stockmarketapp.data.repository.StockRepositoryImpl
import com.codelabs.stockmarketapp.domain.model.CompanyListing
import com.codelabs.stockmarketapp.domain.model.IntradayInfo
import com.codelabs.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

}