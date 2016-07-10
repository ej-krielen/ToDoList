package nl.rekijan.todolist.db;

import android.provider.BaseColumns;

/**
 * Constants for the database
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 10-7-2016
 */
public class TaskContract {
    public static final  String DB_NAME = "nl.rekijan.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
