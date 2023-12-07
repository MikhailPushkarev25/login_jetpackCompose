package com.example.loginproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginproject.ui.theme.LoginProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.White)
                            .padding(24.dp)
                    ) {
                        IconButton(
                            onClick = {},
                            modifier = Modifier.offset(x = (-18).dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowLeft,
                                contentDescription = "",
                                modifier = Modifier.size(32.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            text = "Welcome back!",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                        Text(
                            text = "Sign in to continue",
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            text = "Username",
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                        val email = remember { mutableStateOf("") }
                        TextField(
                            value = email.value,
                            onValueChange = {
                                email.value = it
                            },
                            modifier = Modifier.fillMaxWidth(),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent,
                                cursorColor = Color(0xffFF2B57),
                                focusedIndicatorColor = Color(0xffFF2B57)
                            ),
                            placeholder = {
                                Text(
                                    text = "Input email"
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Email
                            )
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        Text(
                            text = "Password",
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                        val password = remember { mutableStateOf("") }
                        TextField(
                            value = password.value,
                            onValueChange = {
                                password.value = it
                            },
                            modifier = Modifier.fillMaxWidth(),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent,
                                cursorColor = Color(0xffFF2B57),
                                focusedIndicatorColor = Color(0xffFF2B57)
                            ),
                            placeholder = {
                                Text(
                                    text = "Input password"
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Password
                            ),
                            visualTransformation = PasswordVisualTransformation()
                        )
                        TextButton(
                            onClick = {},
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color.Gray,
                            ),
                            modifier = Modifier.align(Alignment.End)
                        ) {
                            Text(
                                text = "Forgot your password?",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                            )
                        }
                        Spacer(modifier = Modifier.height(35.dp))
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(40.dp),
                            colors = ButtonDefaults.textButtonColors(
                                containerColor = Color(0xffFF2B57),
                                contentColor = Color.White
                            )
                        ) {
                            Text(
                                text = "SIGN IN",
                                fontSize = 12.sp
                            )
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Row(
                           modifier = Modifier.align(Alignment.CenterHorizontally)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xff0D6FCA))
                                    .clickable {
                                        Toast
                                            .makeText(
                                                this@MainActivity,
                                                "Facebook",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "f",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 50.sp,
                                    color = Color.White
                                )
                            }
                            Spacer(modifier = Modifier.width(35.dp))
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xff39D0FF))
                                    .clickable {
                                        Toast
                                            .makeText(
                                                this@MainActivity,
                                                "Twitter",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                               Image(
                                   painter = painterResource(id = R.drawable.twitter),
                                   contentDescription = "",
                                   modifier = Modifier.size(40.dp)
                               )
                            }
                            Spacer(modifier = Modifier.width(35.dp))
                            Box(
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xffFF3C47))
                                    .clickable {
                                        Toast
                                            .makeText(
                                                this@MainActivity,
                                                "Google",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.google),
                                    contentDescription = "",
                                    modifier = Modifier.size(40.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Text(
                                text = "Don`t have an account? ",
                                fontSize = 12.sp
                            )
                            TextButton(onClick = {
                                Toast.makeText(this@MainActivity, "Enter", Toast.LENGTH_SHORT)
                                    .show()
                            },
                                colors = ButtonDefaults.textButtonColors(
                                    contentColor = Color.Black
                                )
                            ) {
                                Text(
                                    text = "Sign up",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}