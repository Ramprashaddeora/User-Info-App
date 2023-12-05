package com.example.userinfo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.userinfo.R

@Composable
fun DetailedInfo(){
    Column {


        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 18.dp, top = 15.dp)
//                .padding(start = 18.dp, top = 15.dp, bottom = 15.dp)
        ) {
            item {
//                This is the first Blue Box containing the Student details
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Gray)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Column ()
                    {
                        Text(
                            text = "Course: B Tech",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Dob: 21/05/2004",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Contact No: 7339714665",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "Valid upto: Jul 25",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White
                        )

                    }

                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }
            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Gray)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.qrcode), contentDescription = "Qr Code",
                        modifier = Modifier.width(100.dp))
                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }

            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Gray)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Column {
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                        Text(text = "Hi everyone this is just an example text")
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }
            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Blue)
                        .height(240.dp)
                        .width(320.dp)
                        .padding(start = 15.dp, top = 0.dp, bottom = 10.dp, end = 15.dp)
                ) {
                    Column {

                    }
                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }




        }
    }

}