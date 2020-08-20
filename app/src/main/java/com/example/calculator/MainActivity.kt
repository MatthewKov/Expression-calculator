package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import net.objecthunter.exp4j.tokenizer.UnknownFunctionOrVariableException
import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.util.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var resultShowing = false

    private lateinit var expression : TextView
    private lateinit var buttonOne : Button
    private lateinit var buttonTwo : Button
    private lateinit var buttonThree : Button
    private lateinit var buttonFour : Button
    private lateinit var buttonFive : Button
    private lateinit var buttonSix : Button
    private lateinit var buttonSeven : Button
    private lateinit var buttonEight : Button
    private lateinit var buttonNine : Button
    private lateinit var buttonZero : Button
    private lateinit var buttonAdd : Button
    private lateinit var buttonSub : Button
    private lateinit var buttonMult : Button
    private lateinit var buttonDiv : Button
    private lateinit var buttonDecimal : Button
    private lateinit var buttonDelete : Button
    private lateinit var buttonClear : Button
    private lateinit var buttonOpenParen : Button
    private lateinit var buttonCloseParen : Button
    private lateinit var buttonEquals : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expression = findViewById(R.id.text_expression)
        expression.setOnClickListener(this)
        buttonOne = findViewById(R.id.button_one)
        buttonOne.setOnClickListener(this)
        buttonTwo = findViewById(R.id.button_two)
        buttonTwo.setOnClickListener(this)
        buttonThree = findViewById(R.id.button_three)
        buttonThree.setOnClickListener(this)
        buttonFour = findViewById(R.id.button_four)
        buttonFour.setOnClickListener(this)
        buttonFive = findViewById(R.id.button_five)
        buttonFive.setOnClickListener(this)
        buttonSix = findViewById(R.id.button_six)
        buttonSix.setOnClickListener(this)
        buttonSeven = findViewById(R.id.button_seven)
        buttonSeven.setOnClickListener(this)
        buttonEight = findViewById(R.id.button_eight)
        buttonEight.setOnClickListener(this)
        buttonNine = findViewById(R.id.button_nine)
        buttonNine.setOnClickListener(this)
        buttonZero = findViewById(R.id.button_zero)
        buttonZero.setOnClickListener(this)
        buttonAdd = findViewById(R.id.button_add)
        buttonAdd.setOnClickListener(this)
        buttonSub = findViewById(R.id.button_sub)
        buttonSub.setOnClickListener(this)
        buttonMult = findViewById(R.id.button_mult)
        buttonMult.setOnClickListener(this)
        buttonDiv = findViewById(R.id.button_div)
        buttonDiv.setOnClickListener(this)
        buttonDecimal = findViewById(R.id.button_decimal)
        buttonDecimal.setOnClickListener(this)
        buttonDelete = findViewById(R.id.button_delete)
        buttonDelete.setOnClickListener(this)
        buttonClear = findViewById(R.id.button_clear)
        buttonClear.setOnClickListener(this)
        buttonOpenParen = findViewById(R.id.button_open_paren)
        buttonOpenParen.setOnClickListener(this)
        buttonCloseParen = findViewById(R.id.button_close_paren)
        buttonCloseParen.setOnClickListener(this)
        buttonEquals = findViewById(R.id.button_equals)
        buttonEquals.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        // Reset error message
        if(expression.text == "Invalid expression" || expression.text == "Invalid result") {
            expression.text = "0"
        }

        when(v) {
            buttonOne -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Nothing entered yet or result is currently displayed, so button press starts new expression
                if (expression.text == "0" || resultShowing) {
                    expression.text = "1"
                    resultShowing = false
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "1")
                }
            }
            buttonTwo -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Nothing entered yet or result is currently displayed, so button press starts new expression
                if (expression.text == "0" || resultShowing) {
                    expression.text = "2"
                    resultShowing = false
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "2")
                }
            }
            buttonThree -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Nothing entered yet or result is currently displayed, so button press starts new expression
                if (expression.text == "0" || resultShowing) {
                    expression.text = "3"
                    resultShowing = false
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "3")
                }
            }
            buttonFour -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Nothing entered yet or result is currently displayed, so button press starts new expression
                if (expression.text == "0" || resultShowing) {
                    expression.text = "4"
                    resultShowing = false
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "4")
                }
            }
            buttonFive -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Nothing entered yet or result is currently displayed, so button press starts new expression
                if (expression.text == "0" || resultShowing) {
                    expression.text = "5"
                    resultShowing = false
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "5")
                }
            }
            buttonSix -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Nothing entered yet or result is currently displayed, so button press starts new expression
                if (expression.text == "0" || resultShowing) {
                    expression.text = "6"
                    resultShowing = false
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "6")
                }
            }
            buttonSeven -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Nothing entered yet or result is currently displayed, so button press starts new expression
                if (expression.text == "0" || resultShowing) {
                    expression.text = "7"
                    resultShowing = false
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "7")
                }
            }
            buttonEight -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Nothing entered yet or result is currently displayed, so button press starts new expression
                if (expression.text == "0" || resultShowing) {
                    expression.text = "8"
                    resultShowing = false
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "8")
                }
            }
            buttonNine -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Nothing entered yet or result is currently displayed, so button press starts new expression
                if (expression.text == "0" || resultShowing) {
                    expression.text = "9"
                    resultShowing = false
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "9")
                }
            }
            buttonZero -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Result is currently displayed, so button press starts new expression
                if(resultShowing) {
                    expression.text = "0"
                    resultShowing = false
                }
                // Something already entered
                else if(expression.text != "0") {
                    expression.text = String.format("%s%s", expression.text, "0")
                }
            }
            buttonAdd -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                expression.text = String.format("%s%s", expression.text, "+")
                resultShowing = false
            }
            buttonSub -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Leading negative
                if(expression.text == "0") {
                    expression.text = "-"
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "-")
                    resultShowing = false
                }
            }
            buttonMult -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                expression.text = String.format("%s%s", expression.text, "*")
                resultShowing = false
            }
            buttonDiv -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                expression.text = String.format("%s%s", expression.text, "/")
                resultShowing = false
            }
            buttonDecimal -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                expression.text = String.format("%s%s", expression.text, ".")
            }
            buttonDelete -> {
                // Reset if zero or one characters entered, or if result is showing
                if(expression.text.length <= 1 || resultShowing) {
                    expression.text = "0"
                    resultShowing = false
                }
                else {
                    expression.text = expression.text.subSequence(0, expression.text.length - 1)
                }
            }
            buttonClear -> {
                expression.text = "0"
                resultShowing = false
            }
            buttonOpenParen -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Allow parentheses for multiplication on a result
                if(resultShowing) {
                    resultShowing = false
                }

                if(expression.text == "0") {
                    expression.text = "("
                }
                else {
                    expression.text = String.format("%s%s", expression.text, "(")
                }
            }
            buttonCloseParen -> {
                // Truncate text if reached minimum size
                if(pxToSp(expression.textSize) <= 20.toFloat()) return

                // Result is currently displayed, so button press starts new expression
                if(resultShowing) {
                    expression.text = "0"
                    resultShowing = false
                }

                if(expression.text != "0") {
                    expression.text = String.format("%s%s", expression.text, ")")
                }
            }
            buttonEquals -> {
                var exp by Delegates.notNull<Expression>()
                try {
                    exp = ExpressionBuilder(expression.text.toString()).build()
                }
                catch(e: NumberFormatException) {
                    expression.text = "Invalid expression"
                    resultShowing = true
                    return
                }
                // Invalid parentheses
                catch(e: EmptyStackException) {
                    expression.text = "Invalid expression"
                    resultShowing = true
                    return
                }
                catch(e: UnknownFunctionOrVariableException) {
                    return
                }
                catch (e: Exception) {
                    expression.text = "Invalid expression"
                    resultShowing = true
                    return
                }

                var result by Delegates.notNull<Double>()
                try{
                    result = exp.evaluate()
                }
                catch(e: IllegalArgumentException) {
                    expression.text = "Invalid expression"
                    resultShowing = true
                    return
                }
                catch(e: ArithmeticException) {
                    expression.text = "Invalid result"
                    resultShowing = true
                    return
                }
                catch(e: Exception) {
                    expression.text = "Invalid expression"
                    resultShowing = true
                    return
                }

                // Result is an integer
                if(result == result.toInt().toDouble()) {
                    expression.text = result.toInt().toString()
                }
                else {
                    expression.text = result.toString()
                }
                resultShowing = true
            }
        }
    }

    private fun pxToSp(px: Float) : Float {
        return px / resources.displayMetrics.scaledDensity
    }
}