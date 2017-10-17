package info.androidhive.navigationdrawer.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import info.androidhive.navigationdrawer.fragment.Tab1;
import info.androidhive.navigationdrawer.fragment.Tab2;
import info.androidhive.navigationdrawer.fragment.Tab3;


/**
 * Created by Tharani on 08-10-2017.
 */

public class Pager extends FragmentStatePagerAdapter {

    private final int tabCount;

    public Pager(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
