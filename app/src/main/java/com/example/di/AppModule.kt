package com.example.di

import android.content.Context
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import java.text.SimpleDateFormat
import java.util.Locale
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideGson() = Gson()

    @Provides
    @Named("AString")
    fun provideAString() = "A String"

    @Provides
    @Named("BString")
    fun provideBString() = "B String"

    @Provides
    @Singleton
    fun provideSimpleDateFormat(): SimpleDateFormat =  SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US)

    @Provides
    @Singleton
    fun provideCircularProgressDrawable(@ApplicationContext context: Context): CircularProgressDrawable {
        return CircularProgressDrawable(context).apply {
            strokeWidth = 5f
            centerRadius = 30f
            start()
        }
    }

}