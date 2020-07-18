package com.example.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intent", "Android Programming with Intents")
        courses[course.courseId] = course
        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(key = course.courseId, value = course)
        course = CourseInfo(title = "Java_Fundamental", courseId = "java_lang")
        courses.set(value = course, key = course.courseId)
        course = CourseInfo(courseId = "java_core", title = "Java Fundamentals: The core Platform")
        courses[course.courseId] = course
    }
}