package aula1

val regex = Regex("[a-z]+>")
regex.matches("<tag>")
regex.matches("<>")