package com.example.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    private fun initializeCourses() {
        var course = CourseInfo("android_intent", "Android Programming with Intents")
        courses.set(course.courseId, course)
        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(key = course.courseId, value = course)
    }
}