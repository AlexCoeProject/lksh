import java.util.HashMap
import java.util.Scanner


    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        var command = 0
        var subCommand :Int
        var counter :Int
        var key :String
        var value = ""
        var search :String
        var hmap = HashMap<String, String>()
        var flag = false

        //enter command for action
        while (flag == false) {
            println("Enter 1 to : Add key-value pair")
            println("Enter 2 to : Delete key-value pair")
            println("Enter 3 to : Search key-value pair")
            println("Enter 4 to : Exit program")

            if (scan.hasNextInt()) {
                command = scan.nextInt()
            }

            when (command) {
                1 -> {

                    //enter key
                    println("Enter key")
                    key = scan.nextLine()
                    //check if key was entred
                    if (key.isEmpty()) {
                        key = scan.nextLine()
                    }

                    //check if map contains entred key if no that input value
                    if (hmap.containsKey(key) == false) {
                        println("Enter value")
                        value = scan.nextLine()
                        hmap[key] = value
                        println("Key $key & Value $value are saved")
                    } else {

                        //chck if map containes entered key if yes give extra options
                        if (hmap.containsKey(key)) {
                            print("Value already exists! Enter 1 to override existing value or 2 to exit")
                            subCommand = scan.nextInt()

                            //if user execution of sub options
                            if (subCommand == 1) {
                                println("Enter value")
                                value = scan.nextLine()
                                if (value.isEmpty()) {
                                    value = scan.nextLine()
                                }
                                hmap[key] = value
                                println("Key $key & Value $value are saved")
                            }
                        } else {
                            //if key doesn't exist in map than continue and enter value for current key
                            println("Enter value")
                            if (value.isEmpty()) {
                                value = scan.nextLine()
                            }
                            hmap[key] = value
                            println("Key $key & Value $value are saved")
                        }
                    }
                }

                2 -> {

                    //enter subcommand
                    println("Enter 1 to : Delete by key")
                    println("Enter 2 to : Delete by value")
                    println("Enter 3 to : Delete by key-value pair")
                    println("Enter 4 to : Delete all key-value pairs")
                    println("Enter 5 to : Exit this step")

                    subCommand = scan.nextInt()

                    if (subCommand == 1) {
                        //enter key
                        println("Enter key of pair to delete")
                        key = scan.nextLine()
                        //check if key was entred
                        if (key.isEmpty()) {
                            key = scan.nextLine()
                        }

                        //check if map containes entered key if yes delete this pair
                        if (hmap.containsKey(key)) {
                            println("Key " + key + " & Value " + hmap[key] + " are removed")
                            hmap.remove(key)
                        } else {
                            println("Kay $key doesn't exist please enter other key")
                        }


                    } else if (subCommand == 2) {

                        //enter value
                        println("Enter value of pair to delete")
                        value = scan.nextLine()
                        //check if key was entred
                        if (value.isEmpty()) {
                            value = scan.nextLine()
                        }

                        //check if map containes entered key if yes delete this pair
                        val entryIt = hmap.entries.iterator()

                        // Iterate over all the elements
                        while (entryIt.hasNext()) {
                            val entry = entryIt.next()
                            // Check if Value associated with Key is 10
                            if (entry.value == value) {
                                // Remove the element
                                println("Key " + entry.key + " & Value " + hmap[entry.key] + " are removed")
                                entryIt.remove()
                            }
                        }


                    } else if (subCommand == 3) {
                        //enter key
                        println("Enter key")
                        key = scan.nextLine()
                        //check if key was entered
                        if (key.isEmpty()) {
                            key = scan.nextLine()
                        }

                        //enter value
                        println("Enter value")
                        value = scan.nextLine()
                        //check if key was entered
                        if (value.isEmpty()) {
                            value = scan.nextLine()
                        }

                        if (hmap.containsValue(value) && hmap.containsKey(key)) {
                            for ((key1, value1) in hmap) {
                                if (value1 == value) {
                                    if (key1 == key) {
                                        println("Kay $key1 & Value $value are removed")
                                        hmap.remove(key1)
                                    }
                                }
                            }
                        } else {
                            println("Key and Value doesn't exist please enter other key and value")
                        }


                    } else if (subCommand == 4) {
                        println("All key-value pairs are deleted")
                        hmap.clear()
                    }
                }
                3 -> {

                    //enter key or value to search
                    println("(Enter key||value to search key or value) or (Enter key&&value to search by key and value) or leave blank e.g: ||value or key&&")
                    search = scan.nextLine()
                    //check if key was entered
                    if (search.isEmpty()) {
                        search = scan.nextLine()
                    }
                    //go througth the map and find key corresponding to a searched value
                    key = ""
                    value = ""
                    counter = 0
                    var and = false
                    for (i in 0 until search.length) {
                        counter++
                        if (search[i] == '|' && search[i + 1] == '|') {
                            break
                        } else if (search[i] == '&' && search[i + 1] == '&') {
                            and = true
                            break
                        } else {
                            key = key + search[i].toString()
                        }
                    }

                    for (j in counter + 1 until search.length) {
                        value = value + search[j]
                    }

                    if (and == false) {
                        for ((key1, value1) in hmap) {
                            if (value1.toLowerCase().contains(value) || key1.toLowerCase().contains(key)) {
                                println("Found Key " + key1 + " and Value " + hmap[key1])
                            }
                        }
                    } else {
                        for ((key1, value1) in hmap) {
                            if (value1.toLowerCase().contains(value) && key1.toLowerCase().contains(key)) {
                                println("Found Key " + key1 + " and Value " + hmap[key1])
                            }
                        }
                    }
                }

                4 -> {
                    flag = true
                    println("Wrong command please try again")
                    println()
                }

                else -> {
                    println("Wrong command please try again")
                    println()
                }
            }
        }


    }
