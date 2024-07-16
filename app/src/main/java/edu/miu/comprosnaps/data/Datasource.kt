package edu.miu.listdemo.data

import edu.miu.comprosnaps.R
import edu.miu.listdemo.model.Photo


/***
 * [Datasource] generates a list of [Photo]
 */
class Datasource {
    fun loadPhotos(): List<Photo> {
        return listOf(
            Photo(
                R.string.miu_campus,
                R.drawable.miu_campus
            ),
            Photo(
                R.string.compro_professionals,
                R.drawable.students_life
            ),
            Photo(
                R.string.compro_admission_team,
                R.drawable.compro_admission_team
            ),
            Photo(
                R.string.faculty_student,
                R.drawable.faculty_student
            ),
            Photo(
                R.string.sustainable_living_center,
                R.drawable.sustainable_living_center
            ),
            Photo(
                R.string.students,
                R.drawable.students
            ),
            Photo(
                R.string.graduation_ceremony,
                R.drawable.graduation_ceremony
            ),
            Photo(
                R.string.welcome_students,
                R.drawable.welcome_students
            ),
            Photo(
                R.string.students_life,
                R.drawable.students_life
            ),
            Photo(
                R.string.student_family,
                R.drawable.student_family
            ),
            Photo(
                R.string.student_center,
                R.drawable.student_center
            ),
            Photo(
                R.string.recreation_center,
                R.drawable.recreation_center
            ),
            Photo(
                R.string.campus_walkways_bridge,
                R.drawable.campus_walkways_bridge
            ),
            Photo(
                R.string.miu_snow_fall,
                R.drawable.miu_snow_fall
            ),
            Photo(
                R.string.graduation_memory,
                R.drawable.graduation_memory
            ),
            Photo(
                R.string.my_miu,
                R.drawable.my_miu
            ),
            Photo(
                R.string.class_room,
                R.drawable.class_room
            )
        )
    }
}