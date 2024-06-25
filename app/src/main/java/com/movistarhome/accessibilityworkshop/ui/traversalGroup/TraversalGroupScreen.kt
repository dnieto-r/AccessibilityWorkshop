package com.movistarhome.accessibilityworkshop.ui.traversalGroup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.movistarhome.accessibilityworkshop.R

@Composable
fun TraversalGroupScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(vertical = 30.dp)
            .verticalScroll(rememberScrollState())
            .semantics {
                isTraversalGroup = true
            },
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.fifth_element),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.semantics {
                traversalIndex = 5f
            }
        )
        Text(
            text = stringResource(R.string.first_element),
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 15.dp)
                .semantics {
                    traversalIndex = 1f
                },
            )
        Text(
            text = stringResource(R.string.third_element),
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 15.dp)
                .semantics {
                    traversalIndex = 3f
                }
        )
        Text(
            text = stringResource(R.string.fourth_element),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.semantics {
                traversalIndex = 4f
            }
        )
        Text(
            text = stringResource(R.string.second_element),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.semantics {
                traversalIndex = 2f
            }
        )
    }
}
