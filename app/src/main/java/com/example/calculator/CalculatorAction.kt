package com.example.calculator
//using a sealed class so that in the logic of operations we can have a when clause that implements all use case of the sealed class
//=== business logic of the calculator
sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}
