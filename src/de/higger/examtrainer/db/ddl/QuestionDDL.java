package de.higger.examtrainer.db.ddl;

public class QuestionDDL {
	public static final String CREATE_TABLE = "CREATE TABLE "
			+ QuestionDDL.TABLE_NAME + " (" + QuestionDDL.COLUMNNAME_ID
			+ " INTEGER PRIMARY KEY, " + QuestionDDL.COLUMNNAME_EXAM_ID
			+ " INTEGER, " + QuestionDDL.COLUMNNAME_QUESTION + " TEXT, "
			+ QuestionDDL.COLUMNNAME_HAS_IMAGE + " NUMERIC);";

	public static final String TABLE_NAME = "question";

	public static final String COLUMNNAME_ID = "id";
	public static final String COLUMNNAME_EXAM_ID = "id_exam";
	public static final String COLUMNNAME_QUESTION = "question";
	public static final String COLUMNNAME_HAS_IMAGE = "hasImage";
}
