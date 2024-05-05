package fr.thegostsniperfr.todoapp.data

import androidx.room.*
import fr.thegostsniperfr.todoapp.data.models.ToDoTask
import fr.thegostsniperfr.todoapp.utils.Constants.DATABASE_TABLE
import kotlinx.coroutines.flow.Flow

@Dao // Data Access Object (DAO)
interface ToDoDoa {

    /*
         Try if $DATABASE_TABLE works, if not, replace its value "todo_table"
     */

    @Query("select * from $DATABASE_TABLE order by id")
    fun getAllTasks(): Flow<List<ToDoTask>>

    @Query("select * from $DATABASE_TABLE where id=:taskId")
    fun getSelectTask(taskId: Int): Flow<ToDoTask>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTask(task: ToDoTask) // Suspend is to run in asynchronous

    @Update
    suspend fun updateTask(task: ToDoTask)

    @Delete
    suspend fun deleteTask(task: ToDoTask)

    @Query("delete from $DATABASE_TABLE")
    suspend fun deleteAllTasks()

    @Query("select * from $DATABASE_TABLE where title like :query or description like :query")
    fun searchDatabase(query: String): Flow<List<ToDoTask>>

    @Query("select * from $DATABASE_TABLE order by case " +
            "when priority like 'L%' then 1 " +
            "when priority like 'M%' then 2 " +
            "when priority like 'H%' then 3 " +
            "end")
    fun sortByLowPriority(): Flow<List<ToDoTask>>

    @Query("select * from $DATABASE_TABLE order by case " +
            "when priority like 'H%' then 1 " +
            "when priority like 'M%' then 2 " +
            "when priority like 'L%' then 3 " +
            "end")
    fun sortByHighPriority(): Flow<List<ToDoTask>>
}