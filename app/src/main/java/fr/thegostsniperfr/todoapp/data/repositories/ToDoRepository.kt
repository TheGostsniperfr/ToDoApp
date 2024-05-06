package fr.thegostsniperfr.todoapp.data.repositories

import dagger.hilt.android.scopes.ViewModelScoped
import fr.thegostsniperfr.todoapp.data.ToDoDoa
import fr.thegostsniperfr.todoapp.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao : ToDoDoa) {
    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectTask(taskId = taskId)
    }

    suspend fun addTask(task: ToDoTask) {
        toDoDao.addTask(task = task)
    }

    suspend fun updateTask(task: ToDoTask) {
        toDoDao.updateTask(task = task)
    }

    suspend fun deleteTask(task: ToDoTask) {
        toDoDao.deleteTask(task = task)
    }

    suspend fun deleteAllTasks() {
        toDoDao.deleteAllTasks()
    }

    fun searchDatabase(query: String): Flow<List<ToDoTask>> {
        return toDoDao.searchDatabase(query = query)
    }
}