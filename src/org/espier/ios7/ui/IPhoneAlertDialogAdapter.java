/*
 * Copyright (C) 2013 FMSoft (http://www.fmsoft.cn)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.espier.ios7.ui;

import java.util.List;

import org.espier.ios7ui.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class IPhoneAlertDialogAdapter extends ArrayAdapter<String> {

    private final LayoutInflater mInflater;

    public IPhoneAlertDialogAdapter(Context context, String[] objects) {
        super(context, 0, objects);
        mInflater = LayoutInflater.from(context);
    }
    public IPhoneAlertDialogAdapter(Context context, List<String> objects) {
        super(context, 0, objects);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final String text = getItem(position);

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.iphone_alert_dlg_item, parent, false);
        }

        final TextView b = (TextView) convertView;
        b.setText(text);

        return convertView;
    }

}
