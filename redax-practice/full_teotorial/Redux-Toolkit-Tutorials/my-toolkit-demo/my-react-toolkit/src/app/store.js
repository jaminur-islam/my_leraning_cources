import { configureStore } from "@reduxjs/toolkit";
import cakeSlice from "../features/cake/cakeSlice";
import iceCreamSlice from "../features/iceCream/iceCream";

const store = configureStore({
  reducer: {
    cake: cakeSlice,
    iceCream: iceCreamSlice,
  },
});

export default store;
