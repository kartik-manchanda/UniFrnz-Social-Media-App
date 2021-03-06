package com.example.instagramcloneappkotlin.model

class Post {

    private var postId:String=""
    private var postImage:String=""
    private var publisher:String=""
    private var description:String=""

    constructor()
    constructor(postId: String, postImage: String, publisher: String, description: String) {
        this.postId = postId
        this.postImage = postImage
        this.publisher = publisher
        this.description = description
    }

    fun getPostId():String{
        return postId
    }
    fun setPostId(postId: String){
        this.postId=postId
    }


    fun getPostImage():String{
        return postImage
    }
    fun getPostImage(postImage: String){
        this.postImage=postImage
    }


    fun getPublisher():String{
        return publisher
    }
    fun getPublisher(publisher: String){
        this.publisher=publisher
    }


    fun getDescription():String{
        return description
    }
    fun getDescription(description: String){
        this.description=description
    }


}