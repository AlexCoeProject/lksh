import java.sql.DriverManager.println
import java.util.Scanner

/**
 * Created by alexander on 23/04/2018.
 */

    fun main(args: Array<String>) {
        var sum = 0;
        var scan = Scanner(System.`in`)
        while (scan.hasNextInt()) {
            val num = scan.nextInt()
            sum += (num)
        }
        println("$sum");
    }