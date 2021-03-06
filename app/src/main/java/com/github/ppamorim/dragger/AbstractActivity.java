/*
* Copyright (C) 2015 Pedro Paulo de Amorim
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.github.ppamorim.dragger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;

public abstract class AbstractActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    overridePendingTransition(0, 0);
    super.onCreate(savedInstanceState);
    setContentView(getContentViewId());
    ButterKnife.inject(this);
  }

  @Override protected void onPause() {
    overridePendingTransition(0, 0);
    super.onPause();
  }

  protected abstract int getContentViewId();

}
