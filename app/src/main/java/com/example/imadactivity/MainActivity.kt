package com.example.imadactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the box where you can type numbers
        val textInput = findViewById<EditText>(R.id.editTextNumber)
        // Find the button you tap to see a story or message
        val clickMeButton = findViewById<Button>(R.id.buttonGenerateHistory)
        // Find the place where the story or message appears
        val textView = findViewById<TextView>(R.id.textView2)
        //
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        buttonClear.setOnClickListener  {
            textView.text = ""
        }
        // When you tap the button...
        clickMeButton?.setOnClickListener {

            // Make a spot to hold the story or message
            val message: String
            // Make a spot to hold the number you type in

            // Look at the number you typed in and change it to a special type of number


            // Depending on the number you typed, show a different story or message
            when (textInput.text.toString().toInt()) {
                in 20..24 -> {
                    // If the number is between 20 and 24, this message appears
                    message = "Évariste Galois. The French mathematician, known for his work in abstract algebra and group theory, " +
                            "died at the age of 20 in a duel, a day after being shot in the stomach."
                                .trimIndent()
                }
                in 25..29 -> {
                    // If the number is between 25 and 29, this message appears
                    message = "Tupac Shakur.  A highly influential rapper and actor, Tupac Shakur, " +
                            "also known as 2Pac, was fatally shot in a drive-by shooting in Las Vegas at the age of 25."
                                .trimIndent()
                }
                in 30..34 -> {
                    // If the number is between 30 and 34, this message appears
                    message = "Bruce Lee. The martial artist, actor, and filmmaker died at the age of 32 from a cerebral edema."
                                .trimIndent()
                }
                in 35..39
                    // If the number is between 35 and 39, this message appears
                -> message = ("John F. Kennedy Jr. The son of President John F. Kennedy and Jacqueline Kennedy Onassis," +
                        " died at the age of 38 when the small plane he was piloting crashed into the Atlantic Ocean near Martha's Vineyard.")
                    .trimIndent()
                in 40..44
                    // If the number is between 40 and 44, this message appears
                -> message = "Steve Irwin. The Australian wildlife expert and television personality, known as the \"Crocodile Hunter\", " +
                        " died at the age of 44 from a stingray injury while filming a documentary."
                            .trimIndent()
                in 45..49
                    // If the number is between 45 and 49, this message appears
                -> message = ""
                    .trimIndent()
                in 50..54
                    // If the number is between 50 and 54, this message appears
                -> message = "Napoleon Bonaparte. He was a French military leader and Emperor of the French died at the age of 51 while in exile on the island of Saint Helena."
                            .trimIndent()
                in 55..59
                    // If the number is between 55 and 59, this message appears
                -> message = "Abraham Lincoln (1809–1865) - The 16th President of the United States, Lincoln led the nation through the American Civil War and issued the Emancipation Proclamation, " +
                        "which led to the abolition of slavery. He was assassinated at the age of 56."
                            .trimIndent()
                in 60..64
                    // If the number is between 60 and 64, this message appears
                -> message = ""
                    .trimIndent()
                in 65..69
                    // If the number is between 65 and 69, this message appears
                -> message = "Leonardo da Vinci.  The Italian polymath, renowned for his achievements in painting, science," +
                        "anatomy, and engineering, died at the age of 67 in Amboise, France."
                    .trimIndent()
                in 70..74
                    // If the number is between 70 and 74, this message appears
                -> message = ""
                    .trimIndent()
                in 75..79
                    // If the number is between 75 and 79, this message appears
                -> message = ""
                    .trimIndent()
                in 80..84
                    // If the number is between 80 and 84, this message appears
                -> message = ""
                    .trimIndent()
                in 85..89
                    // If the number is between 85 and 89, this message appears
                -> message = ""
                    .trimIndent()
                in 90..94
                    // If the number is between 90 and 94, this message appears
                -> message = ""
                    .trimIndent()
                in 95..100
                    // If the number is between 95 and 100, this message appears
                -> message = ""
                    .trimIndent()
                else -> {
                    // If the number is not between 0 and 100, this message appears
                    message = "Invalid number, enter a number between 20 -> 100 "
                }
            }

            // Show the story or message in the box where you see things
            textView.text = message

        }


    }
}