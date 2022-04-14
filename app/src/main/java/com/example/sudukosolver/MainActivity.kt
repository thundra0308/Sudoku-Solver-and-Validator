package com.example.sudukosolver
//Author : Suryansh Singh Rajput

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    private var reset: Button? = null
    private var textList: Array<Array<EditText?>> = Array(9) { arrayOfNulls(9) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.solve)
        reset = findViewById(R.id.reset)

        textList[0][0] = findViewById(R.id.ed1)
        textList[0][1]=(findViewById(R.id.ed2))
        textList[0][2]=(findViewById(R.id.ed3))
        textList[0][3]=(findViewById(R.id.ed4))
        textList[0][4]=(findViewById(R.id.ed5))
        textList[0][5]=(findViewById(R.id.ed6))
        textList[0][6]=(findViewById(R.id.ed7))
        textList[0][7]=(findViewById(R.id.ed8))
        textList[0][8]=(findViewById(R.id.ed9))
        textList[1][0]=(findViewById(R.id.ed10))
        textList[1][1]=(findViewById(R.id.ed11))
        textList[1][2]=(findViewById(R.id.ed12))
        textList[1][3]=(findViewById(R.id.ed13))
        textList[1][4]=(findViewById(R.id.ed14))
        textList[1][5]=(findViewById(R.id.ed15))
        textList[1][6]=(findViewById(R.id.ed16))
        textList[1][7]=(findViewById(R.id.ed17))
        textList[1][8]=(findViewById(R.id.ed18))
        textList[2][0]=(findViewById(R.id.ed19))
        textList[2][1]=(findViewById(R.id.ed20))
        textList[2][2]=(findViewById(R.id.ed21))
        textList[2][3]=(findViewById(R.id.ed22))
        textList[2][4]=(findViewById(R.id.ed23))
        textList[2][5]=(findViewById(R.id.ed24))
        textList[2][6]=(findViewById(R.id.ed25))
        textList[2][7]=(findViewById(R.id.ed26))
        textList[2][8]=(findViewById(R.id.ed27))
        textList[3][0]=(findViewById(R.id.ed28))
        textList[3][1]=(findViewById(R.id.ed29))
        textList[3][2]=(findViewById(R.id.ed30))
        textList[3][3]=(findViewById(R.id.ed31))
        textList[3][4]=(findViewById(R.id.ed32))
        textList[3][5]=(findViewById(R.id.ed33))
        textList[3][6]=(findViewById(R.id.ed34))
        textList[3][7]=(findViewById(R.id.ed35))
        textList[3][8]=(findViewById(R.id.ed36))
        textList[4][0]=(findViewById(R.id.ed37))
        textList[4][1]=(findViewById(R.id.ed38))
        textList[4][2]=(findViewById(R.id.ed39))
        textList[4][3]=(findViewById(R.id.ed40))
        textList[4][4]=(findViewById(R.id.ed41))
        textList[4][5]=(findViewById(R.id.ed42))
        textList[4][6]=(findViewById(R.id.ed43))
        textList[4][7]=(findViewById(R.id.ed44))
        textList[4][8]=(findViewById(R.id.ed45))
        textList[5][0]=(findViewById(R.id.ed46))
        textList[5][1]=(findViewById(R.id.ed47))
        textList[5][2]=(findViewById(R.id.ed48))
        textList[5][3]=(findViewById(R.id.ed49))
        textList[5][4]=(findViewById(R.id.ed50))
        textList[5][5]=(findViewById(R.id.ed51))
        textList[5][6]=(findViewById(R.id.ed52))
        textList[5][7]=(findViewById(R.id.ed53))
        textList[5][8]=(findViewById(R.id.ed54))
        textList[6][0]=(findViewById(R.id.ed55))
        textList[6][1]=(findViewById(R.id.ed56))
        textList[6][2]=(findViewById(R.id.ed57))
        textList[6][3]=(findViewById(R.id.ed58))
        textList[6][4]=(findViewById(R.id.ed59))
        textList[6][5]=(findViewById(R.id.ed60))
        textList[6][6]=(findViewById(R.id.ed61))
        textList[6][7]=(findViewById(R.id.ed62))
        textList[6][8]=(findViewById(R.id.ed63))
        textList[7][0]=(findViewById(R.id.ed64))
        textList[7][1]=(findViewById(R.id.ed65))
        textList[7][2]=(findViewById(R.id.ed66))
        textList[7][3]=(findViewById(R.id.ed67))
        textList[7][4]=(findViewById(R.id.ed68))
        textList[7][5]=(findViewById(R.id.ed69))
        textList[7][6]=(findViewById(R.id.ed70))
        textList[7][7]=(findViewById(R.id.ed71))
        textList[7][8]=(findViewById(R.id.ed72))
        textList[8][0]=(findViewById(R.id.ed73))
        textList[8][1]=(findViewById(R.id.ed74))
        textList[8][2]=(findViewById(R.id.ed75))
        textList[8][3]=(findViewById(R.id.ed76))
        textList[8][4]=(findViewById(R.id.ed77))
        textList[8][5]=(findViewById(R.id.ed78))
        textList[8][6]=(findViewById(R.id.ed79))
        textList[8][7]=(findViewById(R.id.ed80))
        textList[8][8]=(findViewById(R.id.ed81))


        button?.setOnClickListener {

            val array: Array<Array<String?>> = Array(9) { arrayOfNulls(9) }

            for(i in 0 until 9) {
                for(j in 0 until 9) {
                    if(textList[i][j]!!.text.isEmpty()) {
                        array[i][j] = "0"
                    } else {
                        array[i][j] = textList[i][j]!!.text.toString()
                    }
                }
            }

            if(isValidConfig(array)) {
                Toast.makeText(this, "Solved Successfully", Toast.LENGTH_SHORT).show()
                helper(array, 0, 0)
                for(i in 0 until 9) {
                    for(j in 0 until 9) {
                        val str: String? = array[i][j]
                        textList[i][j]?.setText(str)
                    }
                }
            } else {
                Toast.makeText(this, "Invalid Question", Toast.LENGTH_SHORT).show()
            }
        }

        reset?.setOnClickListener {
            for(i in 0 until 9) {
                for(j in 0 until 9) {
                    val str: String = ""
                    textList[i][j]?.setText(str)
                }
            }
            Toast.makeText(this, "Reset Done", Toast.LENGTH_SHORT).show()
        }

    }
    private fun correctRow(arr: Array<Array<String?>>, row: Int): Boolean {
        val set: HashSet<String> = hashSetOf()
        for(i in 0 until 9 step 1) {
            if(set.contains(arr[row][i].toString())) {
                return false
            }

            if(!arr[row][i].equals("0")) {
                set.add(arr[row][i].toString())
            }
        }
        return true
    }
    private fun correctCol(arr: Array<Array<String?>>, col: Int): Boolean {
        val set: HashSet<String> = hashSetOf()
        for(i in 0 until 9 step 1) {
            if(set.contains(arr[i][col].toString())) {
                return false
            }

            if(!arr[i][col].equals("0")) {
                set.add(arr[i][col].toString())
            }
        }
        return true
    }
    private fun correctBox(arr: Array<Array<String?>>, srow:Int, scol:Int): Boolean {
        val set: HashSet<String> = hashSetOf()
        for(row in 0 until 3) {
            for(col in 0 until 3) {
                val curr: String = arr[row+srow][col+scol].toString()
                if(set.contains(curr))
                    return false

                if(curr != "0")
                    set.add(curr)
            }
        }
        return true
    }
    private fun isValid(arr: Array<Array<String?>>, row: Int, col: Int): Boolean {
        return correctRow(arr, row) && correctCol(arr,col) && correctBox(arr, row-row%3, col-col%3)
    }
    private fun isValidConfig(arr: Array<Array<String?>>): Boolean {
        for(i in 0 until 9) {
            for(j in 0 until 9) {
                if(!isValid(arr,i,j))
                    return false
            }
        }
        return true
    }
    private fun isSafe(board: Array<Array<String?>>, row:Int, col:Int, num:Int): Boolean {
        for (i in 0 until 9) {
            if (board[i][col] == "$num") {
                return false
            }
            if (board[row][i] == "$num") {
                return false
            }
        }

        val sr = row / 3 * 3
        val sc = col / 3 * 3
        for (i in sr until sr + 3) {
            for (j in sc until sc + 3) {
                if (board[i][j] == "$num") {
                    return false
                }
            }
        }
        return true
    }
    private fun helper(board: Array<Array<String?>>, row: Int, col: Int): Boolean {
        if(row==board.size) {
            return true
        }
        var nrow: Int = 0
        var ncol: Int = 0
        if(col != board.size-1) {
            nrow = row
            ncol = col+1
        } else {
            nrow = row+1
            ncol = 0
        }

        if(board[row][col] != "0") {
            if(helper(board,nrow,ncol)) {
                return true
            }
        } else {
            for(i in 1..9) {
                if(isSafe(board,row,col,i)) {
                    board[row][col] = "$i"
                    if(helper(board,nrow,ncol)) {
                        return true
                    } else {
                        board[row][col] = "0"
                    }
                }
            }
        }
        return false
    }
}