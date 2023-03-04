package aula1

val regex1 = Regex("[0|1]+")
regex1.matches("100111")
regex1.matches("1001112")
regex1.matches("100111w")

val regex2 = Regex("\\w*.java")
regex2.matches("fileX.java")
regex2.matches("fileX.jar")

val regex3 = Regex("[a-z]*[A-Z]?[a-z]*")
regex3.matches("file")
regex3.matches("fileName")
regex3.matches("file_name")

val regex4 = Regex("(public|protected|private)")
regex4.matches("public")
regex4.matches("protected")
regex4.matches("private")

val regex5 = Regex("</?[a-z]*>")
regex5.matches("<doc>")
regex5.matches("</doc>")
regex5.matches("</do/c>")

val regex6 = Regex("\\d*\\.?\\d*")
regex6.matches("12")
regex6.matches("12.21")
regex6.matches("12.21.00")

val regex7 = Regex("\\d{2}-\\d{2}-\\d{4}")
regex7.matches("26-02-2023")

val regex8 = Regex("\\.{3}")
regex8.matches("...")
regex8.matches("....")

val regex9 = Regex("((\\d+)(,?)(\\s?))*")
regex9.matches("1")
regex9.matches("1,2")
regex9.matches("1, 2")
regex9.matches("1, 2, 3")
regex9.matches("1, 2, 3,,4")

val regex10 = Regex("\\{\"\\w*\":\"\\w*\"(,\"\\w*\":\"\\w*\")*}") //TODO
regex10.matches("{}")
regex10.matches("{\"key1\":\"value1\",\"key2\":\"value2\",\"key3\":\"value3\"}")

val regex11 = Regex("\\(\\+\\d{1,3}\\)\\s\\d{9}")
regex11.matches("(+351) 919999999")
regex11.matches("(+1) 919999999")

val regex12 = Regex("[a-z0_9]+([._-][a-z0-9]+)*@[a-z0_9]+([.][a-z0-9]+)*")
regex12.matches("test@elp.pt")
regex12.matches("test.2@elp.pt")
regex12.matches("test_3@elp.pt")
regex12.matches("test..4@elp.pt")
regex12.matches("test@elp.ige.pt")

