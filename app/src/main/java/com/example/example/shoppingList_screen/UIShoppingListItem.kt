package com.example.example.shoppingList_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.example.R
import com.example.example.ui.theme.DarkText
import com.example.example.ui.theme.LigthText

@Preview(showBackground = true)
@Composable
fun UIShoppingListItem() {
    ConstraintLayout(
        modifier = Modifier
            .padding(
                start = 3.dp,
                top = 18.dp,
                end = 3.dp
            )
    ) {
        val (card,deleteButton,editButton,counter)=createRefs()
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(card) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(
                    text="List 1",
                    style = TextStyle(
                        color = DarkText,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                )
                Text(
                    text="12/12/2023 13.00",
                    style = TextStyle(
                        color = LigthText,
                        fontSize = 12.sp
                    )
                )
                LinearProgressIndicator(
                    color = Color.Green,
                    strokeCap = StrokeCap.Round,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp)

                )
            }
        }
        IconButton(
            modifier = Modifier
                .constrainAs(deleteButton) {
                    top.linkTo(card.top)
                    bottom.linkTo(card.top)
                    end.linkTo(card.end)
                }
                .padding(end = 10.dp)
                .size(30.dp),
            onClick = {}
        ) {
            Icon(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Red)
                    .padding(5.dp),
                painter = painterResource(id = R.drawable.delete_icon),
                contentDescription = "d_i"
            )
        }
        IconButton(
            modifier = Modifier
                .constrainAs(editButton) {
                    top.linkTo(card.top)
                    bottom.linkTo(card.top)
                    end.linkTo(deleteButton.start)
                }
                .padding(end = 5.dp)
                .size(30.dp),
            onClick = {}
        ) {
            Icon(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Green)
                    .padding(5.dp),
                painter = painterResource(id = R.drawable.edit_icon),
                contentDescription = "edit_icon"
            )
        }
        Card(
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .constrainAs(counter){
                    top.linkTo(card.top)
                    bottom.linkTo(card.top)
                    end.linkTo(editButton.start)
                }

                .padding(end = 5.dp)
        ) {
            Text(
                text = "2/2",
                modifier = Modifier
                    .background(Color.DarkGray)
                    .padding(top = 3.dp, bottom = 3.dp, start = 5.dp, end = 5.dp),
                color = Color.White
            )
        }
    }
}