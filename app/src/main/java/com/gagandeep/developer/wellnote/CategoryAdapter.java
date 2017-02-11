package com.gagandeep.developer.wellnote;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by gagandeep on 2/11/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new ReportsFragment();
        else if(position == 1)
            return new PrescriptionFragment();
        else if(position == 2)
            return new StatsFragment();
        else
            return new PersonalFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
            return mContext.getString(R.string.reports);
        else if(position == 1)
            return mContext.getString(R.string.prescription);
        else if(position == 2)
            return mContext.getString(R.string.stats);
        else
            return mContext.getString(R.string.personal_details);
    }
}
