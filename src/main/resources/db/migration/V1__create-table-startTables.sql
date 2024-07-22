CREATE TABLE autoIncrementFun (
   colname SERIAL
);

CREATE TABLE tbUsers (
    SEQUENCE_ID SERIAL unique not null,
    USER_ID TEXT PRIMARY KEY UNIQUE NOT NULL,
    USERNAME VARCHAR(50) UNIQUE NOT NULL,
    FIRST_NAME VARCHAR(50) NOT NULL,
    LAST_NAME VARCHAR(50) NOT NULL,
    EMAIL VARCHAR(100) UNIQUE NOT NULL,
    PASSWORD VARCHAR(255) NOT NULL,
    CREATED_AT TIMESTAMP,
    IS_ACTIVE BOOLEAN DEFAULT TRUE
);

CREATE TABLE tbTasks (
    SEQUENCE_ID SERIAL unique not null,
    TASK_ID TEXT PRIMARY KEY UNIQUE NOT NULL,
    USER_ID TEXT NOT NULL,
    TITLE VARCHAR(50) NOT NULL,
    DESCRIPTION TEXT NOT NULL,
    TARGET_DATE TIMESTAMP,
    UPDATED_AT TIMESTAMP,
    CREATED_AT TIMESTAMP,
    IS_COMPLETED BOOLEAN
);