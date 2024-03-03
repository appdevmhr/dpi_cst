package com.appdevmhr.dpi_cst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appdevmhr.dpi_cst.ui.theme.DPICSTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scr = rememberScrollState()
            DPICSTTheme {
                Surface(
                    modifier = Modifier
                        .verticalScroll(scr)
                        .fillMaxSize()
                        .padding(16.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Text(
                            style = TextStyle(
                                fontSize = 30.sp,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.W900
                            ),
                            text = "Department of Computer Technology",
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Image(
                            painter = painterResource(id = R.drawable.cst),
                            contentDescription = "",
                            alignment = Alignment.Center,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        GreetingDPICST()
                    }

                }
            }
        }
    }
}

@Composable
fun GreetingDPICST(modifier: Modifier = Modifier) {
    Text(
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
        ),
        textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
        text = "The department of Computer Technology was established at Dhaka Polytechnic Institute in 1995. This department offered 4 years Diploma-in-Engineering program under the Bangladesh Technical Education Board after 10 years schooling. The Department currently has roughly 15 faculty members (both full time and part time), 04 technical & support staff and 480 numbers of students (120 students per year, 60 for 1st and 60 for 2nd shift). In our admission criteria, there are 20% seats reserved for female student, 15% for Vocational and 5% for disable students.\n" +
                "\n" +
                "After completion the Diploma-in-Engineering Program, students can go to Job market or higher education. For higher education they can admitted in Dhaka University of Engineering and Technology (DUET), Gazipur or any other private or public university in home or abroad for Bachelor degree program like Bachelor of Computer Science & Engineering or Bachelor of Computer Science or Bachelor of Information Technology etc. A Diploma Computer graduate works as a Sub-assistant Engineer in public & private organization.\n" +
                "The major job fields of a Computer Diploma Graduate are Computer Software & Hardware companies, Telecommunication companies, Teachers of TVET institutions, BPO industries, IT sector of all kind of Government and private organization as an IT Officer or Network support Engineer.",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DPICSTTheme {
        GreetingDPICST()
    }
}