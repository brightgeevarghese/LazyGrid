package edu.miu.comprosnaps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.miu.comprosnaps.ui.theme.ComproSnapsTheme
import edu.miu.listdemo.data.Datasource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComproSnapsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PhotoApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PhotoApp(modifier: Modifier = Modifier) {
    PhotoAppGrid(modifier)
}

@Composable
fun PhotoAppGrid(modifier: Modifier = Modifier) {
//    LazyVerticalGrid(
//        columns = GridCells.Adaptive(minSize = 196.dp),
//        modifier = modifier
//    ) {
//        items(Datasource().loadPhotos()) {
//            Image(
//                painter = painterResource(id = it.imageResourceId),
//                contentDescription = stringResource(id = it.stringResourceID),
//                contentScale = ContentScale.Fit
//            )
//        }
//    }
    LazyHorizontalGrid(
        rows = GridCells.Adaptive(minSize = (LocalConfiguration.current.screenHeightDp/3).dp),
            modifier = modifier
    ) {
        items(Datasource().loadPhotos()) {
            Image(
                painter = painterResource(id = it.imageResourceId),
                contentDescription = stringResource(id = it.stringResourceID),
                contentScale = ContentScale.FillHeight
            )
        }
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PhotoAppGridPreview() {
    ComproSnapsTheme {
        PhotoApp()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PhotoAppVerticalGridPreview() {
    ComproSnapsTheme {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 196.dp)
        ) {
            items(Datasource().loadPhotos()) {
                Image(
                    painter = painterResource(id = it.imageResourceId),
                    contentDescription = stringResource(id = it.stringResourceID),
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}




@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PhotoAppHorizontalGridPreview() {
    ComproSnapsTheme {
        LazyHorizontalGrid(
            rows = GridCells.Adaptive(
                minSize = (LocalConfiguration.current.screenHeightDp/3).dp
            )
        ) {
            items(Datasource().loadPhotos()) {
                Image(
                    painter = painterResource(id = it.imageResourceId),
                    contentDescription = stringResource(id = it.stringResourceID),
                    contentScale = ContentScale.FillHeight
                )
            }
        }
    }
}