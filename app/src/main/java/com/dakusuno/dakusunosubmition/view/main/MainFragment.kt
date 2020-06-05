package com.dakusuno.dakusunosubmition.view.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.dakusuno.dakusunosubmition.R
import com.dakusuno.dakusunosubmition.model.Fruit
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment: Fragment(){

    val buah = listOf(
        Fruit("Apple","Well shaped, smooth skinned fruit that is free of bruises. Brownish freckled areas do not affect flavour.","Store in perforated plastic bags in the refrigerator crisper. Cold, humid storage ensures that apples maintain their crispness, juicy texture and full flavour. Apples soften 10 times faster at room temperature.","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2014/12/apple_small.gif"),
        Fruit("Avocado","Ripe, soft fruit. Avoid fruit with dark sunken spots or bruises. Colour and texture depend on variety.","Cover and refrigerate ripe or cut fruit for up to five days. Ripen firm fruit at room temperature until it yields to gentle pressure.","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2015/01/avocado_small.jpg"),
        Fruit("Banana","Firm, unblemished bananas. Yellow with brown speckles indicates a sweet tender fruit.","Keep at room temperature until desire ripeness. For longer storage, once ripe, refrigerate. The peel will darken but remains fresh.","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2015/01/banana_small.gif"),
        Fruit("Blackberries","Firm, firm, plump, blackberries","Keep in the fridge for 1 to 3 days","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2019/03/BlackberrySmall.jpg"),
        Fruit("Blackcurrant","Firm, dry berries with a nice black colour.","Arrange unwashed on paper towel, in shallow pan. Cover, refrigerate for up to ten days. For longer storage, freeze berries for up to one year.","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2015/01/blackcurrant_small.gif"),
        Fruit("Blueberries","Firm, plump, dry, dark coloured blueberries with a powder blue bloom.","Arrange unwashed on paper towel, in shallow pan. Cover, refrigerate for up to ten days. For longer storage, freeze berries for up to one year.","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2015/01/blueberries_small.jpg"),
        Fruit("Carambola","Firm, glossy unbruised fruit. Browning on the tips of the ridges is a sign of ripeness","Cover and refrigerate unwashed ripe fruit for up to 2 days. Ripen at room temperature until skin is golden and ribs are tinged slightly brown and sweet smell.","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2015/01/carambola_small.jpg"),
        Fruit("Clementine","Soft clementines that are free of blemishes and wrinkles, and have even colouration.","Store clementines in a ventilated container. They can be kept in a refrigerator or some other cool, dry place for up to a month (or at room temperature for two or three days).","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2015/01/clementine_small.gif"),
        Fruit("Custard-Apple","Evenly coloured custard-apples which yield slightly when pressed. The ridges of the fruit may be slightly tinged with brown, but the fruit should not appear black, pulpy or withered. Avoid small (under 300g) and dark green fruit.","Store in the fridge for up to 5 days.","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2015/01/custardapple_small.gif"),
        Fruit("Durian","Durian that has cracked just a bit to allow you to smell its strong odour.","Store durians in an air-tight container to preserve its natural aroma. Store in the fridge for up to 5 days.","https://halfyourplate-4kgxi1gvwldjzby.stackpathdns.com/wp-content/uploads/2015/01/durian_samll.gif")
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerview_main.apply {
            layoutManager = GridLayoutManager(activity,2)
            adapter = MainAdapter(buah)
        }
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main,container,false)
    }
}
