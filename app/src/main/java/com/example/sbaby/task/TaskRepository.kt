package com.example.sbaby.task

import com.example.sbaby.DONE
import com.example.sbaby.TO_DO
import com.example.sbaby.TaskModel
import com.example.sbaby.UserModel

class TaskRepository {

    fun getTaskList(): List<TaskModel> {
        return listOf(
            TaskModel(
                "1", "Wash", 12L, "Do something", 12, TO_DO
            ),
            TaskModel(
                "2", "Do", 12L, "Do something", 5, DONE(123L)
            )
        )
    }

    fun getRewardList() {

    }


    fun getUser(): UserModel {
        return UserModel("124", "Artem")
    }
}