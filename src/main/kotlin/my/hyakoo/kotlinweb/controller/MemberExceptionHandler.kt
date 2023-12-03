package my.hyakoo.kotlinweb.controller

import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice(basePackageClasses = [MemberController::class])
class MemberExceptionHandler {
    @ExceptionHandler(RuntimeException::class)
    fun handleRuntimeException(e: RuntimeException): String {
        return "error: ${e.message}"
    }
}