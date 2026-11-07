package com.tpop.popdle.engine

import com.tpop.popdle.data.model.TPopMember
import com.tpop.popdle.data.repository.TPopDatabase
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.math.abs
import kotlin.random.Random

object DailyChallengeManager {

    fun getTodayDateString(): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return sdf.format(Date())
    }

    /**
     * Günlük Gizli Üye Seçim Algoritması:
     * Günün tarihi (örn: "2026-11-08") bir hash koduna dönüştürülür.
     * Bu hash kodunun mutlak değeri, veritabanındaki üye sayısına modülo edilerek (mod N)
     * her gün tüm kullanıcılar için tamamen AYNI gizli T-Pop üyesi senkronize şekilde üretilir.
     */
    fun getDailyTargetMember(): TPopMember {
        val dateStr = getTodayDateString()
        val members = TPopDatabase.members
        val seed = abs(dateStr.hashCode())
        val index = seed % members.size
        return members[index]
    }

    /**
     * Sonsuz / Pratik Modu için rastgele üye seçimi
     */
    fun getRandomTargetMember(): TPopMember {
        val members = TPopDatabase.members
        val randomIndex = Random.nextInt(members.size)
        return members[randomIndex]
    }
}
