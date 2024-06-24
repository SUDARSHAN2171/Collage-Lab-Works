import {defineConfig} from 'vite'
import { fileURLToPath } from 'url'


export default defineConfig({
	plugins: [],
	build: {
		outDir: 'dist',
	
		rollupOptions: {
		  input: {
			index: fileURLToPath(new URL('index.html', import.meta.url)),
			color: fileURLToPath(new URL('color-scheme.html', import.meta.url)),
			dashboard: fileURLToPath(new URL('dashboard.html', import.meta.url)),
			habits: fileURLToPath(new URL('habit-tracker.html', import.meta.url)),
			movie: fileURLToPath(new URL('movie-watchlist.html', import.meta.url)),
			remembrall: fileURLToPath(new URL('remembrall.html', import.meta.url)),
			tenzies: fileURLToPath(new URL('tenzies.html', import.meta.url)),
		  },
		}
	  },	
})