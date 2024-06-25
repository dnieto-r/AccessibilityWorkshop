package com.movistarhome.accessibilityworkshop.ui.roles

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

@Composable
fun RolesScreen() {
    var isCheckboxChecked by remember { mutableStateOf(false) }
    var isSwitchChecked by remember { mutableStateOf(false) }

    Column(
        Modifier
            .padding(vertical = 30.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .toggleable(
                    value = isCheckboxChecked,
                    role = Role.Checkbox,
                    onValueChange = { isCheckboxChecked = !isCheckboxChecked }
                )
                .background(if (isCheckboxChecked) Color.Green else Color.Red)
        ) {
            Text("Checkbox falso")
        }
        Box(
            modifier = Modifier
                .toggleable(
                    value = isSwitchChecked,
                    role = Role.Switch,
                    onValueChange = { isSwitchChecked = !isSwitchChecked }
                )
                .background(if (isSwitchChecked) Color.Green else Color.Red)
        ) {
            Text("Switch falso")
        }
        Box(
            modifier = Modifier
                .semantics {
                    role = Role.Button
                }
                .clickable { }
                .background(Color.Blue)
        ) {
            Text("Botón falso")
        }
        Box(
            modifier = Modifier
                .semantics {
                    role = Role.RadioButton
                }
                .clickable { }
                .background(Color.Blue)
        ) {
            Text("RadioButton falso")
        }
        Row(
            modifier = Modifier
                .semantics(mergeDescendants = true) {
                    role = Role.Tab
                }
                .clickable {

                }
                .background(Color.Blue)
        ) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "Icono de tab falso")
            Text(" Tab falso")
        }
        Icon(imageVector = Icons.Default.ThumbUp,
            contentDescription = "Imagen falsa",

            modifier = Modifier
                .size(48.dp)
                .semantics { role = Role.Image})
        Column(modifier = Modifier
                .semantics { role = Role.DropdownList }
            .clickable {  }) {
            Text(" Dropdown item 1")
            Text(" Dropdown item 2")
        }
    }
}
