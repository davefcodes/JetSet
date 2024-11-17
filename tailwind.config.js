/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ['./*.html',
  "./frontend/scripts/**/*.{js,jsx,ts,tsx}"],
  theme: {
    screens:{
      sm: '480px',
      md: '768px',
      lg: '976px',
      xl: '1440px'
    },
    extend: {
      fontFamily: {
        workSans: ['Work Sans', 'sans-serif'],
      },
      
    },
  },
  plugins: [],
}

