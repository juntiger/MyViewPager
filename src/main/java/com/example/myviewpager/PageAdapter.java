package com.example.myviewpager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int tabCount;

    public PageAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    //첫 페이지의 position: 0 ...
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            Fragment1 fragment1 = new Fragment1();
            return fragment1;
        }else if(position==1){
            Fragment2 fragment2 = new Fragment2();
            return fragment2;
        }else if(position==2){
            Fragment3 fragment3 = new Fragment3();
            return fragment3;
        }else if(position==3){
            Fragment4 fragment4 = new Fragment4();
            return fragment4;
        }else{
            return null;
        }

    }

    //넘어가는 페이지 개수를 리턴(현재 예제에서는 4페이지까지만 넘어갈 수 있도록)
    @Override
    public int getCount() {
        return this.tabCount;
    }
}
