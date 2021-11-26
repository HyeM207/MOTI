package com.example.moti

import com.google.firebase.database.Exclude

class Post (
    var postId : String ?= "", // 글 고유 id
    var riderId : String ?= "", // 작성자 id
    var sharedNum : Int ?= 0, // 공유된 받은 횟수
    var heart : Int ?= 0, // 좋아요 수
    var recordId : String ?= "", // riding 고유 id,
    var hashtags : MutableMap<String, String> = HashMap(),  // 해시태그 한 목록
)
{
    @Exclude
    fun toMap() : Map<String, Any?>{
        return mapOf(
            "postId" to postId,
            "riderId" to riderId,
            "sharedNum" to sharedNum,
            "heart" to heart,
            "recordId" to recordId,
            "hashtag" to hashtags,
        )
    }
}